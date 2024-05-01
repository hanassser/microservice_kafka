package ms;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudCheckService {
    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;
    public FraudCheckService(FraudCheckHistoryRepository fraudCheckHistoryRepository){
        this.fraudCheckHistoryRepository = fraudCheckHistoryRepository;
    }
    public boolean isFraudulentCustomer(Integer customerId){
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customerId)
                        .createdAt(LocalDateTime.now())
                        .isFraudster(false)
                        .build()
        );
        return false;
    }
}
