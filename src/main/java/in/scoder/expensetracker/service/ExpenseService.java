package in.scoder.expensetracker.service;

import in.scoder.expensetracker.entity.Expense;

import java.util.List;

public interface ExpenseService {

    public List<Expense> getAllExpenses();
}
