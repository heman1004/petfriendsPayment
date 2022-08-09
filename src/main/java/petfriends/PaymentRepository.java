package petfriends;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentRepository extends PagingAndSortingRepository<Petfriendspayment, Long>{

	//List<Payment> findByOrderId(Long id);
}