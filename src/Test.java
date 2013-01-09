public class Test<T> {
        private T[][] list;
        
        public Test(T[][] list) {
                this.list = list;
        }
        public void print() {
                for (int i = 0; i < list.length; i++) {
                        for (int j = 0; j < list[i].length; j++) {
                                T val = list[i][j];
                                System.out.println(val);
                        }
                }
        }

        public static void main(String[] args) {
                Integer[][] int_array = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 } };
                String[][] str_array = { { "a", "b", "c", "d", "e" }, { "A", "B", "C", "D", "E" } };
                Test<Integer> test = new Test<Integer>(int_array);
                test.print();
                Test<String> test2 = new Test<String>(str_array);
                test2.print();
        }
}