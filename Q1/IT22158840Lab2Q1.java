public class IT22158840Lab2Q1 {

  public static void main(String[] args) {
    int perimeter = 100; // Given permeter of the fence
    double length;
    double width;

    // width to lenght ratio: 3/4 = 0.75
    double width_ratio = 0.75;

    // Calculate the length and width

    // Using the formula: perimeter = 2 * (lenght + width)
    // Substitute width = width_ratio * length
    // 100 = 2 * (length + (width_ratio * length))
    // 100 = 2 * length * (1 + width_ratio)
    // length = 100 / (2 * (1 + width_ratio)

    length = perimeter / (2 * (1 + width_ratio));
    width = width_ratio * length;

    // output the results
    System.out.println("Length of the fence: " + length);
    System.out.println("width of the fence: " + width);
   }
 }