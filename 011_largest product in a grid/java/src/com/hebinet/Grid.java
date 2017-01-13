package com.hebinet;

public class Grid {

    /**
     * Holds the grid
     */
    private int[][] grid;
    /**
     * Max numbers in a row
     */
    private int length;

    /**
     * Constructor
     *
     * @param content
     */
    public Grid(String content, int length) {
        this.length = length;
        this.loadContent(content);
    }

    /**
     * Prints the largest Product in the grid
     */
    public void printLargestProduct() {
        long largestProduct = 0;
        for (int y = 0; y < (this.grid.length - this.length); y++) {
            for (int x = 0; x < (this.grid[y].length - this.length); x++) {
                long product = getLargestProductWithCenter(x, y);
                if (product > largestProduct) {
                    largestProduct = product;
                }
            }
        }

        System.out.println("Largest product: " + largestProduct);
    }

    /**
     * Finds the largest product from the given center.
     * Scans in a half star pattern
     *
     * @param x
     * @param y
     *
     * @return
     */
    private long getLargestProductWithCenter(int x, int y) {
        long largestProduct = 0;

        long product = this.getRightProduct(x, y);
        if (product > largestProduct) {
            largestProduct = product;
        }

        product = this.getDiagonallyRightDownProduct(x, y);
        if (product > largestProduct) {
            largestProduct = product;
        }

        product = this.getDownProduct(x, y);
        if (product > largestProduct) {
            largestProduct = product;
        }

        product = this.getDiagonallyLeftDownProduct(x, y);
        if (product > largestProduct) {
            largestProduct = product;
        }

        return largestProduct;
    }

    /**
     * Calculates the product to the right
     *
     * @param x
     * @param y
     *
     * @return
     */
    private long getRightProduct(int x, int y) {
        if (x + (this.length - 1) < this.grid[y].length) {
            long product = 1;
            for (int i = 0; i < this.length; i++) {
                product *= this.grid[y][x + i];
            }
            return product;
        }

        return 0L;
    }

    /**
     * Calculates the product diagonally to the right down
     *
     * @param x
     * @param y
     *
     * @return
     */
    private long getDiagonallyRightDownProduct(int x, int y) {
        if (x + (this.length - 1) < this.grid[y].length && y + (this.length - 1) < this.grid.length) {
            long product = 1;
            for (int i = 0; i < this.length; i++) {
                product *= this.grid[y + i][x + i];
            }
            return product;
        }

        return 0L;
    }

    /**
     * Calculates the product down
     *
     * @param x
     * @param y
     *
     * @return
     */
    private long getDownProduct(int x, int y) {
        if (y + (this.length - 1) < this.grid.length) {
            long product = 1;
            for (int i = 0; i < this.length; i++) {
                product *= this.grid[y + i][x];
            }
            return product;
        }

        return 0L;
    }

    /**
     * Calculates the product diagonally to the left down
     *
     * @param x
     * @param y
     *
     * @return
     */
    private long getDiagonallyLeftDownProduct(int x, int y) {
        if (x - (this.length - 1) > 0 && y + (this.length - 1) < this.grid.length) {
            long product = 1;
            for (int i = 0; i < this.length; i++) {
                product *= this.grid[y + i][x - i];
            }
            return product;
        }

        return 0L;
    }

    /**
     * Loads the given String in the int array
     *
     * @param content
     */
    private void loadContent(String content) {
        String[] lines = content.split("\n");

        this.grid = new int[lines.length][];

        for (int lineNumber = 0; lineNumber < lines.length; lineNumber++) {
            String line = lines[lineNumber];
            String[] columns = line.split(" ");

            this.grid[lineNumber] = new int[columns.length];
            for (int column = 0; column < columns.length; column++) {
                this.grid[lineNumber][column] = Integer.parseInt(columns[column]);
            }
        }
    }
}
