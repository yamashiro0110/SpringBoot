package sample.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import sample.domain.user.UserSummary;

@Repository
public interface UserSummaryRepository extends JpaRepository<UserSummary, Long>, JpaSpecificationExecutor<UserSummary> {
}
