package Homework06;

public class LabeledPoint extends Point {
    private String Label;

    public LabeledPoint(int x, double y, String label) {
        super(x, y);
        Label = label;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }
}
