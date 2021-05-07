package com.qa.lottery.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.lottery.domain.Lottery;

public interface LotteryRepo extends JpaRepository<Lottery, Long>{
	Lottery findByName(String name);
}
