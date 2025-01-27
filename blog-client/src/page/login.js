import {useEffect} from "react";

export default function Login() {

    useEffect(() => {
        init();
    }, []);

    async function init() {
        const data = await fetch("http://localhost:8080/member");
        const json = await data.text();
        console.log(json);
    }

    return (
        <div>
            Login Page
        </div>
    );
}
