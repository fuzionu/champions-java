package app;

public class DoubleSpaceMaker
{
    public String makeDoubleSpace(int indents)
    {
        if (indents < 0)
        {
            throw new IllegalArgumentException("Negative argument");
        }

        StringBuilder output = new StringBuilder();
        indents += 2;

        for (int y = 1; y <= indents; y++)
        {
            output.append(" ");
        }

        return output.toString();
    }
}
