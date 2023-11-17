package com.expensetracker.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.expensetracker.dto.ExpenseDTO;
import com.expensetracker.service.ExpenseService;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Override
	public List<ExpenseDTO> getAllExpenses() {
		return null;
	}

	@Override
	public ExpenseDTO getExpenseById(Long id) {
		return null;
	}

	@Override
	@Transactional
	public ExpenseDTO createExpense(ExpenseDTO expenseDTO) {
		return null;
	}

	@Override
	@Transactional
	public ExpenseDTO updateExpense(Long id, ExpenseDTO expenseDTO) {
		return null;
	}

	@Override
	@Transactional
	public boolean deleteExpense(Long id) {
		return false;
	}

	@Override
	public List<String> getMostExpendedCategory() {
		return null;
	}
}
