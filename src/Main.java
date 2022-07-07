public class Main {

    public static void main(String[] args) {

        StringBuilder input = new StringBuilder();

        for (int i = 0; i < Data.data.length() - 1; i++) {

            char character = Data.data.charAt(i);

            if (String.valueOf(character).matches(".")){

                input.append(character);
            }
        }

        String data = new String(input);

        char[][] dataGrid = new char[30][30];

        for (int i = 0; i < 30; i++) {

            innerfor: for (int j = 0; j < 30; j++) {

                int charAt = (i * 30) + j;

                 dataGrid[i][j] = data.charAt(charAt);
            }

        }

        for (int i = 0; i < 30; i++) {

            for (int j = 0; j < 30; j++) {

                System.out.print(dataGrid[i][j]);
            }

            System.out.println();

        }

    }
}
