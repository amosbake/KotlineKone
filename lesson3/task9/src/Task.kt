// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = customers.filter {
   val (delivered,undelieved) =  it.orders.partition { it.isDelivered }
    delivered.size < undelieved.size
}.toSet()