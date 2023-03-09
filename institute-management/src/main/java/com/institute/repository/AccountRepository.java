package com.institute.repository;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.data.repository.query.Param;

import com.institute.entity.Account;

public class AccountRepository implements JpaRepository<Account, Integer>{
	@Query("from Account where accountHolderName like :s%")
	public
	List<Account> getAccountByName(@Param("s") String accountName) {
		return null;
	}
	@Query("from Account where accountType like :s%")
	List<Account> getAccountByType(@Param("s") String accountType) {
		return null;
	}
	@Query("from Account where phoneNo =:s")
	public
	List<Account> getAccountByPhoneNo(@Param("s") long phoneNo) {
		return null;
	}
	@Query("from Account where bank_id =:s")
	List<Account> getAccountByInstitute(@Param("s") int id) {
		return null;
	}
	@Override
	public Page<Account> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	public <S extends com.institute.repository.Account> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Account> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	public void delete(com.institute.repository.Account entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Account> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(Account entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends Account> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Account> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public <S extends Account> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Account> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends Account> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public <S extends Account, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Account> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Account> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Account> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Account> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Account> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAllInBatch(Iterable<Account> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Account getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Account getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Account getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Account> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Account> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
}
	