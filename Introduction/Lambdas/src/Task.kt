fun containsEven(collection: Collection<Int>): Boolean = collection.any {
    it.rem(2) == 0
}
