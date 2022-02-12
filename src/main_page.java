
public class main_page extends javax.swing.JFrame {

    public main_page() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        profileTab = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        resultTab = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        queriesTab = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dashboardTabPanel = new javax.swing.JTabbedPane();
        profilePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        idTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genderBOX = new javax.swing.JComboBox<>();
        deptBOX = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        resetBTN = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        searchTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        resultPanel = new javax.swing.JPanel();
        queriesPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Student Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(227, 227, 227))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 100));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        profileTab.setBackground(new java.awt.Color(153, 153, 255));
        profileTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileTabMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Profile Create");

        javax.swing.GroupLayout profileTabLayout = new javax.swing.GroupLayout(profileTab);
        profileTab.setLayout(profileTabLayout);
        profileTabLayout.setHorizontalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        profileTabLayout.setVerticalGroup(
            profileTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        resultTab.setBackground(new java.awt.Color(153, 153, 255));
        resultTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTabMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Result Update");

        javax.swing.GroupLayout resultTabLayout = new javax.swing.GroupLayout(resultTab);
        resultTab.setLayout(resultTabLayout);
        resultTabLayout.setHorizontalGroup(
            resultTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultTabLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultTabLayout.setVerticalGroup(
            resultTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        queriesTab.setBackground(new java.awt.Color(153, 153, 255));
        queriesTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queriesTabMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Queries");

        javax.swing.GroupLayout queriesTabLayout = new javax.swing.GroupLayout(queriesTab);
        queriesTab.setLayout(queriesTabLayout);
        queriesTabLayout.setHorizontalGroup(
            queriesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queriesTabLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        queriesTabLayout.setVerticalGroup(
            queriesTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queriesTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(resultTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(queriesTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(profileTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(resultTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(queriesTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 600));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Student ID");

        idTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTFActionPerformed(evt);
            }
        });

        nameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setText("Gender");

        genderBOX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        genderBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        deptBOX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deptBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "BBA", "Civil" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Department");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel9.setText("Email");

        emailTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phoneTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("Contact No");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("Address");

        addressTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addBTN.setBackground(new java.awt.Color(51, 204, 0));
        addBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addBTN.setForeground(new java.awt.Color(255, 255, 255));
        addBTN.setText("Add");

        updateBTN.setBackground(new java.awt.Color(51, 153, 255));
        updateBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        updateBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateBTN.setText("Update");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        deleteBTN.setBackground(new java.awt.Color(255, 51, 0));
        deleteBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        resetBTN.setBackground(new java.awt.Color(153, 153, 255));
        resetBTN.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        resetBTN.setForeground(new java.awt.Color(255, 255, 255));
        resetBTN.setText("Reset");
        resetBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBTNActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setText("Search ");

        searchTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTFActionPerformed(evt);
            }
        });

        studentTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Department", "Email", "Contact No", "Address", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(profilePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(genderBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deptBOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(profilePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(profilePanelLayout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(profilePanelLayout.createSequentialGroup()
                                    .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressTF)
                                        .addGroup(profilePanelLayout.createSequentialGroup()
                                            .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(profilePanelLayout.createSequentialGroup()
                                                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(49, 49, 49)
                                                    .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(49, 49, 49)
                                                    .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(48, 48, 48)
                                                    .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGap(77, 77, 77))))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameTF)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(genderBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deptBOX, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(phoneTF)
                        .addGap(85, 85, 85))
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
        );

        dashboardTabPanel.addTab("tab1", profilePanel);

        resultPanel.setBackground(new java.awt.Color(0, 153, 153));
        dashboardTabPanel.addTab("tab2", resultPanel);

        queriesPanel.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout queriesPanelLayout = new javax.swing.GroupLayout(queriesPanel);
        queriesPanel.setLayout(queriesPanelLayout);
        queriesPanelLayout.setHorizontalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        queriesPanelLayout.setVerticalGroup(
            queriesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        dashboardTabPanel.addTab("tab3", queriesPanel);

        getContentPane().add(dashboardTabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 1040, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileTabMouseClicked
        dashboardTabPanel.setSelectedIndex(0);
    }//GEN-LAST:event_profileTabMouseClicked

    private void resultTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTabMouseClicked
        dashboardTabPanel.setSelectedIndex(1);
    }//GEN-LAST:event_resultTabMouseClicked

    private void queriesTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queriesTabMouseClicked
        dashboardTabPanel.setSelectedIndex(2);           
    }//GEN-LAST:event_queriesTabMouseClicked

    private void idTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTFActionPerformed

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void resetBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resetBTNActionPerformed

    private void searchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTFActionPerformed

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTabbedPane dashboardTabPanel;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JComboBox<String> deptBOX;
    private javax.swing.JTextField emailTF;
    private javax.swing.JComboBox<String> genderBOX;
    private javax.swing.JTextField idTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JPanel profileTab;
    private javax.swing.JPanel queriesPanel;
    private javax.swing.JPanel queriesTab;
    private javax.swing.JButton resetBTN;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JPanel resultTab;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}
