package by.javaonline.partethree.stringregex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.regex.Pattern;

public class TaskOne {
    private static Frame frame;
    private static Pattern p = Pattern.compile("[\n\r]");        // абзацы
    private static Pattern s1 = Pattern.compile("[!.?]");        // строки без разделителей
    private static Pattern s2 = Pattern.compile("(?<=[!.?])");   // строки с разделителями
    private static Pattern w = Pattern.compile("(?U)\\W+");      // слова

    public static void main(String[] args) {
        frame = new Frame();
    }

    public static void sortingParagraphs(String text) {
        String[] paragraphs = p.split(text);
        String result = "";
        ArrayList<StringValue> list = new ArrayList<>();
        for (String paragraph : paragraphs) {
            String[] sentences = s1.split(paragraph);
            list.add(new StringValue(paragraph, sentences.length));
        }
        Collections.sort(list);
        for (StringValue string : list) {
            result += string.getStr() + "\n";
        }
        frame.setText(result);
    }

    public static void sortingWords(String text) {
        char[] ch;
        char lastElement;
        String result = "";
        String[] paragraphs = p.split(text);
        ArrayList<StringValue> list = new ArrayList<>();
        for (String paragraph : paragraphs) {
            String[] sentences = s2.split(paragraph);
            for (String sentence : sentences) {
                ch = sentence.toCharArray();
                lastElement = ch[ch.length - 1];
                String[] words = w.split(sentence);
                for (String word : words) {
                    list.add(new StringValue(word, word.length()));
                }
                Collections.sort(list);
                for (StringValue string : list) {
                    result += string.getStr() + " ";
                }
                result = result.trim();
                result += lastElement;
                list.clear();
            }
            result += "\n";
        }
        frame.setText(result);
    }

    public static void sortingLexemes(String text) {
        char[] wordToChar, sentenceToChar;
        char lastElement;
        char ch = frame.getTextField().charAt(0);
        int count = 0;
        String result = "";
        String[] paragraphs = p.split(text);
        ArrayList<StringValue> list = new ArrayList<>();
        for (String paragraph : paragraphs) {
            String[] sentences = s2.split(paragraph);
            for (String sentence : sentences) {
                sentence = sentence.trim();
                sentenceToChar = sentence.toCharArray();
                lastElement = sentenceToChar[sentenceToChar.length - 1];
                String[] words = w.split(sentence);
                for (String word : words) {
                    wordToChar = word.toCharArray();
                    for (int i = 0; i < word.length(); i++) {
                        if (wordToChar[i] == ch) {
                            count += 1;
                        }
                    }
                    list.add(new StringValue(word, count));
                    count = 0;
                }
                Collections.sort(list, new Comparator<StringValue>() {
                    @Override
                    public int compare(StringValue o1, StringValue o2) {
                        int temp = o2.getValue() - o1.getValue();
                        if (temp == 0) {
                            return o1.getStr().compareTo(o2.getStr());
                        }
                        return temp;
                    }
                });
                for (StringValue string : list) {
                    result += string.getStr() + " ";
                }
                result = result.trim();
                result += lastElement + " ";
                list.clear();
            }
            result += "\n";
        }
        frame.setText(result);
    }
}

class StringValue implements Comparable<StringValue> {
    private String str;
    private int value;

    public StringValue(String str, int value) {
        this.str = str;
        this.value = value;
    }

    public String getStr() {
        return str;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(StringValue o) {
        if (this.value > o.value) {
            return 1;
        } else if (this.value < o.value) {
            return -1;
        }
        return 0;
    }
}

class Frame extends JFrame {

    private JPanel panel, panel1, panel2, panel3;
    private JButton button1, button2, button3;
    private JTextArea textArea1, textArea2;
    private JLabel label1, label2, label3;
    private JTextField textField;

    Frame() {
        super("Работа с регулярными выражениями");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
        panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());

        textArea1 = new JTextArea(10, 50);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);

        textArea2 = new JTextArea(10, 50);
        textArea2.setLineWrap(true);
        textArea2.setWrapStyleWord(true);

        label1 = new JLabel("Исходный текст:");
        label2 = new JLabel("Результат:");
        label3 = new JLabel("Символ: ");

        textField = new JTextField("а", 2);
        textField.setHorizontalAlignment(JTextField.CENTER);

        button1 = new JButton("Абзацы");
        button1.setToolTipText("Сортировка абзацев по количеству предложений");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TaskOne.sortingParagraphs(textArea1.getText());
            }
        });

        button2 = new JButton("Слова");
        button2.setToolTipText("Сортировка слов в предложении по длине");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TaskOne.sortingWords(textArea1.getText());
            }
        });

        button3 = new JButton("Лексемы");
        button3.setToolTipText("Сортировка лексем");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TaskOne.sortingLexemes(textArea1.getText());
            }
        });

        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(label3);
        panel1.add(textField);

        panel2.add(textArea1, BorderLayout.CENTER);
        panel2.add(label1, BorderLayout.NORTH);
        panel3.add(textArea2, BorderLayout.CENTER);
        panel3.add(label2, BorderLayout.NORTH);

        add(panel);
        panel.add(panel1, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.CENTER);
        panel.add(panel3, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    public void setText(String s) {
        textArea2.setText(s);
    }

    public String getTextField() {
        return textField.getText();
    }
}
