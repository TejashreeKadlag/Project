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

import com.institute.entity.Institute;
import com.institute.entity.Institute;
public class InstituteRepository implements JpaRepository<Institute, Integer> {

	@Query("from Institute where instituteName like :s%")
	public
	List<Institute> getInstituteByName(@Param("s") String instituteName) {
		return null;
	}
	@Query("from Institute where branchName like :s%")
	public
	List<Institute> getInstituteByBranchName(@Param("s") String branchName) {
		return null;
	}
	@Query("from Institute where branchLocation like :s%")
	List<Institute> getInstitutebyBranchLocation(@Param("s") String branchLocation) {
		return null;
	}
	@Override
	public Page<Institute> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Institute> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Institute> findById(Integer id) {
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
	@Override
	public void delete(Institute entity) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll(Iterable<? extends Institute> entities) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Institute> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}
	@Override
	public <S extends Institute> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Institute> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends Institute> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public <S extends Institute, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Institute> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Institute> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Institute> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Institute> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public <S extends Institute> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Institute> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAllInBatch(Iterable<Institute> entities) {
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
	public Institute getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Institute getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Institute getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Institute> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Institute> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
}
