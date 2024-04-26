/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdsplus
 */
public class MARTE2_SIMULINK_DTTSetup extends DeviceSetup {

    /**
     * Creates new form MARTE2_SIMULINK_DTTSetup
     */
    public MARTE2_SIMULINK_DTTSetup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel2 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceField1 = new DeviceField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        deviceInputs1 = new DeviceInputs();
        jPanel3 = new javax.swing.JPanel();
        deviceOutputs1 = new DeviceOutputs();
        jPanel4 = new javax.swing.JPanel();
        deviceParameters1 = new DeviceParameters();

        setDeviceProvider("localhost:8100");
        setDeviceTitle("DTT Simularot");
        setDeviceType("MARTE2_SIMULINK_DTT");
        setHeight(500);
        setWidth(700);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Write CPU Mask: ");
        deviceField3.setNumCols(4);
        deviceField3.setOffsetNid(145);
        jPanel2.add(deviceField3);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Port: ");
        deviceField1.setNumCols(6);
        deviceField1.setOffsetNid(309);
        jPanel2.add(deviceField1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        deviceInputs1.setOffsetNid(26);
        jPanel1.add(deviceInputs1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Inputs", jPanel1);

        jPanel3.setLayout(new java.awt.BorderLayout());

        deviceOutputs1.setOffsetNid(139);
        jPanel3.add(deviceOutputs1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Outputs", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        deviceParameters1.setNumParameters(3);
        deviceParameters1.setOffsetNid(4);
        deviceParameters1.setParameterOffset(4);
        jPanel4.add(deviceParameters1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Parameters", jPanel4);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceField deviceField1;
    private DeviceField deviceField3;
    private DeviceInputs deviceInputs1;
    private DeviceOutputs deviceOutputs1;
    private DeviceParameters deviceParameters1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}