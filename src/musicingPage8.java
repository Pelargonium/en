
public class musicingPage8 extends javax.swing.JFrame {
    public musicingPage8() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        securityMainPanel = new javax.swing.JPanel();
        Security = new javax.swing.JLabel();
        passwordPanel = new javax.swing.JPanel();
        changePasswordButton = new javax.swing.JButton();
        currentPassword = new javax.swing.JLabel();
        newPassword = new javax.swing.JLabel();
        newPassword2 = new javax.swing.JLabel();
        passwordChangeCurrent = new javax.swing.JPasswordField();
        passwordChanceNew = new javax.swing.JPasswordField();
        passwordChangeNew2 = new javax.swing.JPasswordField();
        questionPanel = new javax.swing.JPanel();
        securityQuestion = new javax.swing.JLabel();
        answer = new javax.swing.JLabel();
        securityApplyButton = new javax.swing.JButton();
        securityQuestionBox = new javax.swing.JComboBox<>();
        securityAnswerField = new javax.swing.JTextField();
        securityBack = new javax.swing.JButton();
        deleteAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 255, 0));
        setPreferredSize(new java.awt.Dimension(480, 640));

        securityMainPanel.setBackground(new java.awt.Color(135, 155, 243));

        Security.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Security.setForeground(new java.awt.Color(255, 255, 255));
        Security.setText("Security");

        passwordPanel.setBackground(new java.awt.Color(0, 204, 255));

        changePasswordButton.setBackground(new java.awt.Color(0, 204, 255));
        changePasswordButton.setText("Change Password");
        changePasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordButtonMouseClicked(evt);
            }
        });

        currentPassword.setText("Current Password:");

        newPassword.setText("New Password:");

        newPassword2.setText("New Password (Again)");

        passwordChangeCurrent.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                passwordChangeCurrentInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        passwordChanceNew.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                passwordChanceNewInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        passwordChangeNew2.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                passwordChangeNew2InputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(changePasswordButton)
                .addGap(138, 138, 138))
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentPassword)
                    .addComponent(newPassword)
                    .addComponent(newPassword2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordChangeNew2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(passwordChanceNew, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(passwordChangeCurrent))
                .addContainerGap())
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPassword)
                    .addComponent(passwordChangeCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword)
                    .addComponent(passwordChanceNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword2)
                    .addComponent(passwordChangeNew2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(changePasswordButton)
                .addContainerGap())
        );

        questionPanel.setBackground(new java.awt.Color(0, 233, 215));

        securityQuestion.setText("Security Question:");

        answer.setText("Answer:");

        securityApplyButton.setBackground(new java.awt.Color(0, 233, 215));
        securityApplyButton.setText("Apply");
        securityApplyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityApplyButtonMouseClicked(evt);
            }
        });

        securityQuestionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Question 1", "Question 2", "Question 3", "Question 4" }));
        securityQuestionBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityQuestionBoxMouseClicked(evt);
            }
        });
        securityQuestionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityQuestionBoxActionPerformed(evt);
            }
        });

        securityAnswerField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                securityAnswerFieldInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        securityAnswerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityAnswerFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(securityApplyButton)
                .addGap(186, 186, 186))
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(securityQuestion)
                    .addComponent(answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(securityAnswerField)
                    .addComponent(securityQuestionBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(securityQuestion)
                    .addComponent(securityQuestionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer)
                    .addComponent(securityAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(securityApplyButton)
                .addContainerGap())
        );

        securityBack.setIcon(new javax.swing.ImageIcon("C:\\Users\\Merdan\\Downloads\\if_arrow_left_58001.png")); // NOI18N
        securityBack.setText("Back");
        securityBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securityBackMouseClicked(evt);
            }
        });

        deleteAccount.setBackground(new java.awt.Color(0, 0, 0));
        deleteAccount.setForeground(new java.awt.Color(255, 0, 0));
        deleteAccount.setText("Delete Account");
        deleteAccount.setBorderPainted(false);
        deleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout securityMainPanelLayout = new javax.swing.GroupLayout(securityMainPanel);
        securityMainPanel.setLayout(securityMainPanelLayout);
        securityMainPanelLayout.setHorizontalGroup(
            securityMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(securityMainPanelLayout.createSequentialGroup()
                .addGroup(securityMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(securityMainPanelLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(Security)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(securityMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(securityMainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(questionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, securityMainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(securityBack)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, securityMainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(deleteAccount)
                .addGap(167, 167, 167))
        );
        securityMainPanelLayout.setVerticalGroup(
            securityMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(securityMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Security)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(securityBack)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(securityMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(securityMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void securityQuestionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityQuestionBoxActionPerformed
        
    }//GEN-LAST:event_securityQuestionBoxActionPerformed

    private void securityAnswerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityAnswerFieldActionPerformed
        
    }//GEN-LAST:event_securityAnswerFieldActionPerformed

    private void passwordChangeCurrentInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_passwordChangeCurrentInputMethodTextChanged
        
    }//GEN-LAST:event_passwordChangeCurrentInputMethodTextChanged

    private void passwordChanceNewInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_passwordChanceNewInputMethodTextChanged
        
    }//GEN-LAST:event_passwordChanceNewInputMethodTextChanged

    private void passwordChangeNew2InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_passwordChangeNew2InputMethodTextChanged
        
    }//GEN-LAST:event_passwordChangeNew2InputMethodTextChanged

    private void changePasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordButtonMouseClicked
        
    }//GEN-LAST:event_changePasswordButtonMouseClicked

    private void securityApplyButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityApplyButtonMouseClicked
        
    }//GEN-LAST:event_securityApplyButtonMouseClicked

    private void deleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAccountMouseClicked
        
    }//GEN-LAST:event_deleteAccountMouseClicked

    private void securityBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityBackMouseClicked
        
    }//GEN-LAST:event_securityBackMouseClicked

    private void securityAnswerFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_securityAnswerFieldInputMethodTextChanged
        
    }//GEN-LAST:event_securityAnswerFieldInputMethodTextChanged

    private void securityQuestionBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securityQuestionBoxMouseClicked
        
    }//GEN-LAST:event_securityQuestionBoxMouseClicked

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(musicingPage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musicingPage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musicingPage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musicingPage8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musicingPage8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Security;
    private javax.swing.JLabel answer;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JLabel currentPassword;
    private javax.swing.JButton deleteAccount;
    private javax.swing.JLabel newPassword;
    private javax.swing.JLabel newPassword2;
    private javax.swing.JPasswordField passwordChanceNew;
    private javax.swing.JPasswordField passwordChangeCurrent;
    private javax.swing.JPasswordField passwordChangeNew2;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JTextField securityAnswerField;
    private javax.swing.JButton securityApplyButton;
    private javax.swing.JButton securityBack;
    private javax.swing.JPanel securityMainPanel;
    private javax.swing.JLabel securityQuestion;
    private javax.swing.JComboBox<String> securityQuestionBox;
    // End of variables declaration//GEN-END:variables
}
