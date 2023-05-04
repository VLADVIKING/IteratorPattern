package netology.ru;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator();
    }

    private class RandomIterator implements Iterator {

        @Override
        public boolean hasNext() {
            return ((random.nextInt((max - min) + 1) + min) <= max && (random.nextInt((max - min) + 1) + min) >= min);
        }

        @Override
        public Object next() {
            return (random.nextInt((max - min) + 1) + min);
        }
    }
}


