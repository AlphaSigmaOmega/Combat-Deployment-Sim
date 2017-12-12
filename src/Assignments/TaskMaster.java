
package Assignments;


public class TaskMaster extends javax.swing.JFrame {
    ArrayList list;
    ListIterator li;
    int curtask, tottask;
    Task t;
    
    public TaskMaster() {
        initComponents();
        list = new ArrayList();
        li=list.Iterator();
        curtask=0;
        tottask=0;
    }
    
    /* mnuinsertafterActionPerformed
    String nm=txtname.getText();
    String d=txtdesc.getText();
    Task t = new Task(nm,d);
    
    */
    
    /* btnlastActionPerformed
    if(curtask==tottask) return;
    while(lii.hasNext())
        li.next();
    t=(Tast)li.previous();
    */
    
    /* btnnextActionPerformed
    if(curtask==tottask)return;
    curtask++;
    lblctask.setText(""+curtask);
    li.next();
    li.next();
    */
    
    /*mnureplace
    if(tottask==0){
       JOptionPan.showMessageDialog(
    */
    
    /* mnuremove
    if(tottask==0)return;
    li.next();
    li.remove();
    tottask--;
    lbltottask.setText(""+tottask);
    if(tottask==0){
        txtname.setText("");
        txtdesc.setText("");
        curtask=0;
        lblctask.setText("n/a");
        return;
    }
    */
    
    /*mnushowall
    String result="";
    for (nt x=0; x<list.size(); x++){
        t=(Task)list.get(x);
    */
    
    /*
    TO DO
    First,
    Back,
    Restore,
    Clear
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lbldesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuprogram = new javax.swing.JMenu();
        mnuedit = new javax.swing.JMenu();
        mnuinsert = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblname.setText("Name:");

        lbldesc.setText("Description:");

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        mnuprogram.setText("Program");
        jMenuBar1.add(mnuprogram);

        mnuedit.setText("Edit");
        jMenuBar1.add(mnuedit);

        mnuinsert.setText("Insert");
        jMenuBar1.add(mnuinsert);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbldesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblname)
                .addGap(18, 18, 18)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldesc)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lblname;
    private javax.swing.JMenu mnuedit;
    private javax.swing.JMenu mnuinsert;
    private javax.swing.JMenu mnuprogram;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
