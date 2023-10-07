package crypto.theblockchainpost.designpatterns.observer.examples;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Slf4j
public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
    }

    static class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            log.info("Don't do it, you might regret it!");
        }
    }

    static class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            log.info("Come on do it, you only live once!");
        }
    }

}
