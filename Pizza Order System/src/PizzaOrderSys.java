import javax.swing.*;
import java.awt.*;

public class PizzaOrderSys extends JFrame{
    private JPanel pnlMain;
    private JComboBox<PizzaSizes> cmbSizes;
    private JComboBox<PizzaToppings> cmbToppings;
    private JComboBox<YesNo> cmbYN;
    private JButton btnCalcTotal;
    private JLabel lblSize;
    private JLabel lblExtraCheese;
    private JLabel lblToppings;
    private JLabel lblTotal;

    private int total;

    public PizzaOrderSys() {
        total = 0;

        btnCalcTotal.setPreferredSize(new Dimension(80, 40));
        pnlMain.setPreferredSize(new Dimension(400, 300));

        cmbSizes.setModel(new DefaultComboBoxModel<>(PizzaSizes.values()));
        cmbToppings.setModel(new DefaultComboBoxModel<>(PizzaToppings.values()));
        cmbYN.setModel(new DefaultComboBoxModel<>(YesNo.values()));

        cmbSizes.setName("pizzaSizeChoice");
        cmbToppings.setName("pizzaToppingsChoice");
        cmbYN.setName("extraCheeseChoice");
        btnCalcTotal.setName("calculateButton");


        btnCalcTotal.addActionListener(e -> {
            if(cmbSizes.getSelectedItem() == PizzaSizes.Small) {
                total += 10;
            } else if(cmbSizes.getSelectedItem() == PizzaSizes.Medium) {
                total += 15;
            } else {
                total += 20;
            }

            total += 2;

            if(cmbYN.getSelectedItem() == YesNo.Yes) {total += 3;}

            lblTotal.setText(String.valueOf(total));
            total = 0;
        });

    }

    static void main() {
        JFrame frame = new JFrame("Pizza Order System");

        PizzaOrderSys pizzaPlace = new PizzaOrderSys();

        frame.setContentPane(pizzaPlace.pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
