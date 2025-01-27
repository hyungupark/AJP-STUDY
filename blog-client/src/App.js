import logo from './logo.svg';
import './App.css';
import {Route, Routes} from "react-router";
import Login from "./page/login";
import BlogList from "./page/blog-list";
import BlogDetail from "./page/blog-detail";
import Main from "./page/main";

function App() {
    return (
        <div className="App">
            <Routes>
                <Route path="/" element={<Main/>}/>
                <Route path="/login" element={<Login/>}/>
                <Route path="/bloglists" element={<BlogList/>}/>
                <Route path="/blogdetail" element={<BlogDetail/>}/>
            </Routes>
        </div>
    );
}

export default App;
