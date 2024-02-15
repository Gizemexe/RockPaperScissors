package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.Action;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RockPaperScissorsGame {

	private JFrame frame;
	private JLabel lblPlayerScore;
    private JLabel lblComputerScore;
    private JButton result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RockPaperScissorsGame window = new RockPaperScissorsGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	
	String playerChoice;
	String computerChoice;
	int countP,countC = 0;
	Random random = new Random();
	
	ArrayList<String> options = new ArrayList<>(Arrays.asList("ROCK", "PAPER","SCISSORS"));

	
	private String computerChoice() {
        return options.get(random.nextInt(options.size()));
    }
	

	private void winningGame(String playerChoice, String computerChoice) {
		String resultText="";
        if (playerChoice.equals(computerChoice)) {
        	resultText = "Draw, Try Again!";
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("PAPER")) {
            countC++;
            resultText = "Computer Won!";
        } else if (playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) {
            countP++;
            resultText = "Player won!";
        } else if (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER")) {
            countP++;
            resultText = "Player won!";
        } else if (playerChoice.equals("SCISSORS") && computerChoice.equals("ROCK")) {
            countC++;
            resultText = "Computer won!";
        } else if (playerChoice.equals("PAPER") && computerChoice.equals("SCISSORS")) {
            countC++;
            resultText = "Computer won!";
        } else if (playerChoice.equals("PAPER") && computerChoice.equals("ROCK")) {
            countP++;
            resultText = "Player won!";
        }
        updateScores();
        result.setText(resultText);
    }
	
	private void updateScores() {
        lblPlayerScore.setText(Integer.toString(countP));
        lblComputerScore.setText(Integer.toString(countC));
        
    }

	private void resetScores() {
        countP = 0;
        countC = 0;
        updateScores();
        result.setText("");
        
    }
	public RockPaperScissorsGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        frame = new JFrame("Rock Paper Scissors Game");
        frame.setBounds(600, 600, 650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);

        JLabel lblNewLabel = new JLabel("PLAYER");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        panel.add(lblNewLabel);

        lblPlayerScore = new JLabel(Integer.toString(countP));
        lblPlayerScore.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblPlayerScore.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblPlayerScore);

        JLabel lblNewLabel_2 = new JLabel("-");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
        panel.add(lblNewLabel_2);

        lblComputerScore = new JLabel(Integer.toString(countC));
        lblComputerScore.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblComputerScore.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(lblComputerScore);

        JLabel lblNewLabel_4 = new JLabel("COMPUTER");
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
        panel.add(lblNewLabel_4);

        JPanel panel_1 = new JPanel();
        frame.getContentPane().add(panel_1, BorderLayout.SOUTH);

        JPanel panel_2 = new JPanel();
        frame.getContentPane().add(panel_2, BorderLayout.CENTER);

        JButton player = new JButton("");
        
        panel_2.add(player);

        result = new JButton("");
        //result.setEnabled(false);
        panel_2.add(result);

        JButton computer = new JButton("");
        
        panel_2.add(computer);

        JButton rockButton = new JButton("ROCK");
        rockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String playerChoice = "ROCK";
                player.setText("ROCK");
                String computerChoice = computerChoice();
                computer.setText(computerChoice);
                winningGame(playerChoice, computerChoice);
            }
        });
        rockButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_1.add(rockButton);

        JButton paperButton = new JButton("PAPER");
        paperButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String playerChoice = "PAPER";
                player.setText("PAPER");
                String computerChoice = computerChoice();
                computer.setText(computerChoice);
                winningGame(playerChoice, computerChoice);
            }
        });
        paperButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_1.add(paperButton);

        JButton scissorsButton = new JButton("SCISSORS");
        scissorsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String playerChoice = "SCISSORS";
                player.setText("SCISSORS");
                String computerChoice = computerChoice();
                computer.setText(computerChoice);
                winningGame(playerChoice, computerChoice);
            }
        });
        scissorsButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel_1.add(scissorsButton);
        
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetScores();
            }
        });
        panel_1.add(resetButton);
    }
        
    }
