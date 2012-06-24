package introcs;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * decompiled by jad-gui
 * 
 * @author yywill
 *
 * @param <T>
 */
public class RandomQueue<T>
  implements Iterable<T>
{
  private static final int INIT_CAPACITY = 2;
  private T[] a;
  private int N = 0;

  public RandomQueue()
  {
    this.a = ((T[])new Object[2]);
  }
  public boolean isEmpty() {
    return this.N == 0; } 
  public int size() { return this.N;
  }

  private void resize(int paramInt)
  {
    T[] arrayOfObject = (T[])new Object[paramInt];
    for (int i = 0; i < this.N; i++)
      arrayOfObject[i] = this.a[i];
    this.a = arrayOfObject;
  }

  public void enqueue(T paramItem)
  {
    if (this.N == this.a.length) resize(2 * this.a.length);
    this.a[(this.N++)] = paramItem;
  }

  public T sample()
  {
    if (isEmpty()) throw new RuntimeException("Randomized queue underflow");
    int i = StdRandom.uniform(this.N);
    return this.a[i];
  }

  public T dequeue()
  {
    if (isEmpty()) throw new RuntimeException("Randomized queue underflow");

    int i = StdRandom.uniform(this.N);
    T localObject = this.a[i];
    this.a[i] = this.a[(this.N - 1)];
    this.a[(this.N - 1)] = null;
    this.N -= 1;
    if ((this.N > 0) && (this.N == this.a.length / 4)) resize(this.a.length / 2);
    return localObject;
  }
  public Iterator<T> iterator() {
    return new RandomQueue.RandomIterator();
  }

  private class RandomIterator implements Iterator<T> {
    private RandomQueue<T> copy = new RandomQueue();

    public RandomIterator() { for (int i = 0; i < RandomQueue.this.N; i++)
        this.copy.enqueue(RandomQueue.this.a[i]); }

    public boolean hasNext() {
      return !this.copy.isEmpty(); } 
    public void remove() { throw new UnsupportedOperationException(); }

    public T next() {
      if (!hasNext()) throw new NoSuchElementException();
      return this.copy.dequeue();
    }
  }
}