public static void main(String[] args) {
    SortedIntegerList list = new SortedIntegerList(false);
    list.add(3);
    list.add(1);
    list.add(2);
    list.add(2);
    list.remove(4);
    list.remove(2);
    SortedIntegerList expected = new SortedIntegerList(false);
    expected.add(1);
    expected.add(3);
    System.out.println(list.equals(expected)); // true

    SortedIntegerList listWithDuplicates = new SortedIntegerList(true);
    listWithDuplicates.add(1);
    listWithDuplicates.add(2);
    listWithDuplicates.add(2);
    listWithDuplicates.add(3);
    SortedIntegerList expectedDuplicates = new SortedIntegerList(true);
    expectedDuplicates.add(1);
    expectedDuplicates.add(2);
    expectedDuplicates.add(2);
    expectedDuplicates.add(3);
    System.out.println(listWithDuplicates.equals(expectedDuplicates)); // true
}
