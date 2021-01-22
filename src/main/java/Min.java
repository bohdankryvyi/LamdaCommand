public class Min {
    Calculate cal = new Calculate() {
        @Override
        public int Rahuemo(int a, int b, int c) {
            int minimum = Math.min(a, Math.min(b,c));
            return minimum;
        }
    };
}
