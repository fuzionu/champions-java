package app;

public class DoubleSpaceMaker
{
    public String makeDoubleSpace(int doubleSpaceMultiplier)
    {
        if (doubleSpaceMultiplier < 0)
        {
            throw new IllegalArgumentException("Negative argument");
        }

        StringBuilder output = new StringBuilder();
        doubleSpaceMultiplier = doubleSpaceMultiplier * 2;
        for (int y = 1; y <= doubleSpaceMultiplier; y++)
        {
            output.append(" ");
        }

        return output.toString();
    }
}
