package seg3x02.books_rest_api.repository

import org.springframework.data.repository.CrudRepository
import seg3x02.books_rest_api.entities.Order

interface OrderRepository: CrudRepository<Order, Long>