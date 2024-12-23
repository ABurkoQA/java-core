package fourthTask;

public interface AccountService {
    Account findAccountByOwnerId(long id);

    long countAccountsWithBalanceGreaterThan(long value);
}
