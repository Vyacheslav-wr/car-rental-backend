package by.salei.rental.service;

import by.salei.rental.entity.AuthAccount;
import by.salei.rental.repo.AuthAccountRepository;
import by.salei.rental.service.api.AuthAccountService;
import org.springframework.stereotype.Service;

@Service
public class AuthAccountServiceImpl extends BaseServiceImpl<AuthAccount, AuthAccountRepository> implements AuthAccountService {
}
