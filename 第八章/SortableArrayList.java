// Introduced in Chapter 8
/** An array-based List of Comparables. */
public class SortableArrayList<E extends Comparable<E>> extends ArrayList<E>
		implements Comparable<SortableArrayList<E>> {
	private boolean isOrdered = true;

	public boolean contains(E target) {
		if (isOrdered) {
			insertionSort();
		}
		int bottom = 0;
		int top = size() - 1;
		while (bottom <= top) {
			int midpoint = (top + bottom) / 2;
			int comparison = target.compareTo(get(midpoint));
			if (comparison < 0) {
				top = midpoint - 1;
			} else if (comparison == 0) {
				return true;
			} else {
				bottom = midpoint + 1;
			}
		}
		return false;
	}

	/** Arrange the elements in this List from smallest to largest. */
	public void insertionSort() {
		for (int i = 1; i < size(); i++) {
			E target = get(i);
			int j;
			for (j = i - 1; (j >= 0) && (get(j).compareTo(target) > 0); j--) {
				set(j + 1, get(j));
			}
			set(j + 1, target);
		}     
		isOrdered = true;
	}

	// �����������Ƴ�Ԫ�ص��µĻ���������

	@Override
	public void add(E target) {
		super.add(target);
		if (isOrdered && size() != 1) {
			if (this.get(this.size() - 2).compareTo(target) > 0) {
				isOrdered = false;
			}
		}
	}

	@Override
	public void set(int index, E target) {
		// TODO Auto-generated method stub
		super.set(index, target);
		if (isOrdered) {
			if (this.get(index).compareTo(this.get(index + 1)) > 0
					|| this.get(index).compareTo(this.get(index - 1)) < 0) {
				isOrdered = false;
			}
		}
	}

	// ѡ�������㷨
	// �Ƚ����±��¼�±�
	public void selectionSort() {
		for (int i = 0; i < size() - 1; i++) { // ������������
			int j = i;// ���ڽ�������

			for (int z = i + 1; z < size(); z++) {
				if ((get(j).compareTo(get(z))) > 0) { // get the data after i
					j = z;
				}
			}
			if (j != i) { // �����Ҫ����
				E target = get(i);
				this.set(i, get(j));
				this.set(j, target);
			}

		}
		isOrdered = true;
	}

	@Override
	public int compareTo(SortableArrayList<E> that) {
		// TODO Auto-generated method stub
		if (this == that) { // �����ֱͬ�ӷ���
			return 0;
		}
		for (int i = 0; i < this.size() && i < that.size(); i++) { // �ڱȽϹ����в�ͬ
			@SuppressWarnings("unchecked")
			int a = get(i).compareTo(that.get(i));
			if (a != 0) {
				return a;
			}
		}
		return this.size() - that.size(); // ��һ��size�Ѿ��������
	}

	public static void main(String args[]) {
		SortableArrayList<Integer> a = new SortableArrayList<Integer>();
		SortableArrayList<Integer> b = new SortableArrayList<Integer>();
		SortableArrayList<Card> c;
		a.add(3);
		a.add(2);
		a.add(1);
		System.out.println(a);
		a.selectionSort();
		System.out.println(a);
		b.add(5);
		System.out.println(a.compareTo(b));

	}

}
