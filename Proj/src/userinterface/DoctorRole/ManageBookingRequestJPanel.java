/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookingAppointmentRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anike
 */
public class ManageBookingRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageBookingRequestJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private int ID;
    private Person person = null;
    private DoctorOrganization doctorOrganization;
    private ArrayList<Person> personDir;
    private Network net;
    
    public ManageBookingRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network n) {
        initComponents();
        if(personDir == null){
        personDir = new ArrayList();
        }
        if(person == null){
            person = new Person();
        }
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.net = n;
        this.doctorOrganization = (DoctorOrganization) organization;
        workRequestJTable.getTableHeader().setForeground(new Color(0,153,255));
        //tblPatient.getTableHeader().setForeground(new Color(0,153,255));
        populateTable();
        
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if (request instanceof BookingAppointmentRequest) {
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = ((BookingAppointmentRequest) request).getPatientName();
                row[2] = request.getSender().getEmployee().getName();
                row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[4] = request.getStatus();
                model.addRow(row);
            }
        }
    }
    
    
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        btnViewPatient = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnManageLabReq = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workRequestJTable.setForeground(new java.awt.Color(0, 204, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Patient Name", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(0, 204, 255));
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/refresh.jpg"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        btnViewPatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewPatient.setForeground(new java.awt.Color(0, 204, 255));
        btnViewPatient.setText("Examine Patient");
        btnViewPatient.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 255));
        jButton1.setText("View Vital Sign History");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnManageLabReq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnManageLabReq.setForeground(new java.awt.Color(0, 204, 255));
        btnManageLabReq.setText("Manage Lab Request");
        btnManageLabReq.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageLabReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageLabReqActionPerformed(evt);
            }
        });

        backJButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(0, 204, 255));
        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/Images/back.jpg"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Appointment Request Table");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Manage Appointment Bookings");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/utils/user_login_man_profile_account-128.png"))); // NOI18N

        jLabel10.setText("You are currently logged in.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(80, 80, 80)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnManageLabReq, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(66, 66, 66)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnManageLabReq, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(backJButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed
              
        int selected = workRequestJTable.getSelectedRow();
        
        if (selected < 0){
            JOptionPane.showMessageDialog(null, "Please select row from Appointment Request table");
            return;
        }
        
        BookingAppointmentRequest request = (BookingAppointmentRequest)workRequestJTable.getValueAt(selected, 0);
        if (request.getStatus() == "Sent") {
            request.setStatus("Processing");
        }
        if (request.getStatus().matches("Completed")) {
            int result = JOptionPane.showConfirmDialog(null, "Request already Completed.Do you still want to Examine?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {

            } else if (result == JOptionPane.NO_OPTION) {
                return;
            }
        }
        
        if (enterprise != null) {
            for (Person p : enterprise.getPersonDirectory().getPersonDir()) {
                if (p.getPersonName().matches(request.getPatientName())) {
                    personDir.add(p);
                    person = p;
                }
            }
        }
     
        DocToPatientExaminationJPanel examinePatient = new DocToPatientExaminationJPanel(userProcessContainer,person,request,userAccount, enterprise,net);
        userProcessContainer.add("examinePatient", examinePatient);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select row from table");
            return;
        }
        BookingAppointmentRequest request = (BookingAppointmentRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getPatientName().isEmpty()){
             JOptionPane.showMessageDialog(null, "Empty Patient name");
            return;
        }
        if (enterprise != null) {
            for (Person p : enterprise.getPersonDirectory().getPersonDir()) {
                if (p.getPersonName().matches(request.getPatientName())) {
                    if (p.getVsignHist().getVitalHistory().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No vital sign history to be displayed");
                        return;
                    }
                    ViewVitalSignHistoryJPanel viewJPanel = new ViewVitalSignHistoryJPanel(userProcessContainer, p);
                    userProcessContainer.add("ViewVitalSignHistoryJPanel", viewJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnManageLabReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageLabReqActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        String temp_str = null;
        String tmp_str = null; 

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select row from table");
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
         temp_str = request.getMessage();
        if (request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "Please first assign the appointment request before you raise lab request");
            return;
        }
       
        String[] split_1 = temp_str.split("PatientID= ");
        String firstSubString = split_1[1];
        String[] split_2 = firstSubString.split(" Message- ");
        tmp_str = split_2[0];
        boolean check = false;
        if (enterprise != null) {
            for (Person p : enterprise.getPersonDirectory().getPersonDir()) {
                if ((p.getPatientID() == Integer.parseInt(tmp_str))&& (check ==false)) {
                    ManageLabRequestJPanel manageLabRequestJPanel = new ManageLabRequestJPanel(userProcessContainer, userAccount, doctorOrganization, enterprise,p);
                    userProcessContainer.add("ManageLabRequestJPanel", manageLabRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                    check = true;                    
                }
            }            
        }
        
        
    }//GEN-LAST:event_btnManageLabReqActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnManageLabReq;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}