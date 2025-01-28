import { useEffect, useState } from "react";

export default function Login() {
    const [userData, setUserData] = useState(null); // 상태로 선언

    useEffect(() => {
        init();
    }, []);

    async function init() {
        const response = await fetch("http://localhost:8080/login", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({
                userId: "shoppingAdmin",
                password: "1234",
            }),
        });
        const data = await response.json();
        console.log(data);

        setUserData(data);
    }

    return (
        <div>
            {userData ? <p>{userData.userName}</p> : <p>Loading...</p>}
        </div>
    );
}
