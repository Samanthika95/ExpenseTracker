package in.scoder.expensetracker.service;

import in.scoder.expensetracker.entity.Expense;
import in.scoder.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;
    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
