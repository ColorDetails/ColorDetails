package com.example.colordetails.repository;
import com.example.colordetails.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

//钱包
public interface WalletRepository extends JpaRepository<Wallet,Integer> {
    //查询钱包信息
    @Query(value = "SELECT * FROM wallet",nativeQuery = true)
    List<Wallet> findAllWallet();
    //根据user_id查询钱包信息
    @Query(value = "SELECT * FROM wallet WHERE user_id=?1",nativeQuery = true)
    Wallet findByWalletUserId(Integer user_id);
    //根据id查询钱包信息
    @Query(value = "SElECT * FROM wallet WHERE id=?1",nativeQuery = true)
    Wallet findByWalletID(Integer id);
}
