import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import { useAuth } from './Security/AuthContext'

export default function LoginComponent() {

    const [username, setUsername] = useState("Patrick")
    const [password, setPassword] = useState("")
    
    const [showSuccessMessage, setShowSuccessMessage] = useState(false)
    const [showErrorMessage, setShowErrorMessage] = useState(false)
    
    const navigate = useNavigate()
    
    const authContext = useAuth()

    function handleUsernameChange(event) {
        // console.log(event.target.value);
        setUsername(event.target.value);
    }

    function handlePasswordChange(event) {
        // console.log(event.target.value);
        setPassword(event.target.value);
    }

    function handleSubmit() {
        if(username==='Patrick' && password==='password') {
            authContext.setAuthenticated(true)   
            setShowSuccessMessage(true)
            setShowErrorMessage(false)
            navigate(`/welcome/${username}`)
        }
        else {
            authContext.setAuthenticated(false)
            setShowErrorMessage(true)
            setShowSuccessMessage(false)

        }
    }

    return (
        <div className="Login">
            <h1>Time to Login!</h1>
            {showSuccessMessage && <div className="SuccessMessage">Authenticated Successfully</div>}
            {showErrorMessage && <div className="ErrorMessage">Authenticated Failed. Please check your credentials.</div>}
            <div className="LoginForm">
                <div>
                    <label>User Name</label>
                    <input type="text" name="username" value={username} onChange={handleUsernameChange} />
                </div>
                <div>
                    <label>Password</label>
                    <input type="password" name="password" value={password} onChange={handlePasswordChange}/>
                </div>
                <div>
                    <button type="button" name="login" onClick={handleSubmit}>login</button>
                </div>
            </div>
        </div>
    )
}