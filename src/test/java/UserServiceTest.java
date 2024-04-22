
import org.example.UserRepository;
import org.example.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.example.User;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private UserRepository UserRepositoryMock;
    @Test
    public void getUserByIdTest() {
        when(UserRepositoryMock.findUserById(1)).thenReturn(new User(1,"djalil"));
        //Arrange
        UserService userService = new UserService(UserRepositoryMock);
        //Act
        User user = userService.getUserById(1);
        //Assert
        assertEquals(user.getName(), "djalil");

        verify(UserRepositoryMock).findUserById(1);
    }
}
