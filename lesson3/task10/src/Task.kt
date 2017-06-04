// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val allProduct = this.customers.flatMap { it.orders }.flatMap { it.products }.toSet()
    return this.customers.fold(allProduct){
        partProduct,customer ->
        partProduct.intersect(customer.orders.flatMap { it.products })
    }
}