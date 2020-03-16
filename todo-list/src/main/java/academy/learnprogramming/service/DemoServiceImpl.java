package academy.learnprogramming.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService
{

    @Override
    public String getHelloMessage(String user)
    {
        return "Hello u fucker " + user;
    }

    @Override
    public String getWelcomeMessage()
    {
        return "Welcome to the demo application u fucker!!!!!";
    }
}
