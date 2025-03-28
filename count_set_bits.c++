
int count_set_bits(int n) {
    int count = 0;
    while (n) {
        n &= (n - 1); // Removes the rightmost set bit
        count++;
    }
    return count; // Removed count++ mistake
}
