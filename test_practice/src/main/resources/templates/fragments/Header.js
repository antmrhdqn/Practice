import React from 'react';
import { Link } from 'react-router-dom'; // react-router-dom에서 Link 가져오기

function Header() {
    return (
        <header id="header" className="header fixed-top d-flex align-items-center">
            <div className="d-flex align-items-center justify-content-between">
                {/* 홈으로 이동하는 링크 */}
                <Link to="/" className="logo d-flex align-items-center">
                    <img src="assets/img/logo.png" alt=""/>
                </Link>
                <i className="bi bi-list toggle-sidebar-btn"></i>
            </div>
            <div className="search-bar">
                <form className="search-form d-flex align-items-center" method="POST" action="#">
                    <input type="text" name="query" placeholder="Search" title="Enter search keyword"/>
                    <button type="submit" title="Search"><i className="bi bi-search"></i></button>
                </form>
            </div>
            <nav className="header-nav ms-auto">
                <ul className="d-flex align-items-center">
                    <li className="nav-item d-block d-lg-none">
                        {/* 검색 바를 토글하는 링크 */}
                        <Link to="#" className="nav-link nav-icon search-bar-toggle ">
                            <i className="bi bi-search"></i>
                        </Link>
                    </li>
                    <li className="nav-item dropdown">
                        {/* 알림 메뉴를 토글하는 링크 */}
                        <Link to="#" className="nav-link nav-icon" data-bs-toggle="dropdown">
                            <i className="bi bi-bell"></i>
                            <span className="badge bg-primary badge-number">4</span>
                        </Link>
                        {/* 알림 메뉴 */}
                        <ul className="dropdown-menu dropdown-menu-end dropdown-menu-arrow notifications">
                            <li className="dropdown-header">
                                You have 4 new notifications
                                <Link to="#"><span className="badge rounded-pill bg-primary p-2 ms-2">View all</span></Link>
                            </li>
                            {/* 알림 목록 */}
                        </ul>
                    </li>
                    <li className="nav-item dropdown">
                        {/* 채팅 메뉴를 토글하는 링크 */}
                        <Link to="#" className="nav-link nav-icon" data-bs-toggle="dropdown">
                            <i className="bi bi-chat-left-text"></i>
                            <span className="badge bg-success badge-number">3</span>
                        </Link>
                        {/* 채팅 메뉴 */}
                        <ul className="dropdown-menu dropdown-menu-end dropdown-menu-arrow messages">
                            <li className="dropdown-header">
                                You have 3 new messages
                                <Link to="#"><span className="badge rounded-pill bg-primary p-2 ms-2">View all</span></Link>
                            </li>
                            {/* 메시지 목록 */}
                        </ul>
                    </li>
                    <li className="nav-item dropdown pe-3">
                        {/* 프로필 메뉴를 토글하는 링크 */}
                        <Link to="#" className="nav-link nav-profile d-flex align-items-center pe-0" data-bs-toggle="dropdown">
                            <img src="assets/img/profile-img.png" alt="Profile" className="rounded-circle"/>
                            <span className="d-none d-md-block dropdown-toggle ps-2">user01</span>
                        </Link>
                        {/* 프로필 메뉴 */}
                        <ul className="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
                            <li className="dropdown-header">
                                <h6>Kevin Anderson</h6>
                                <span>Web Designer</span>
                            </li>
                            <li>
                                <hr className="dropdown-divider"/>
                            </li>
                            {/* 프로필 메뉴 항목 */}
                            <li>
                                <Link to="users-profile.html" className="dropdown-item d-flex align-items-center">
                                    <i className="bi bi-person"></i>
                                    <span>My Profile</span>
                                </Link>
                            </li>
                            <li>
                                <hr className="dropdown-divider"/>
                            </li>
                            {/* 프로필 메뉴 항목 */}
                            <li>
                                <Link to="users-profile.html" className="dropdown-item d-flex align-items-center">
                                    <i className="bi bi-gear"></i>
                                    <span>Account Settings</span>
                                </Link>
                            </li>
                            <li>
                                <hr className="dropdown-divider"/>
                            </li>
                            {/* 프로필 메뉴 항목 */}
                            <li>
                                <Link to="#" className="dropdown-item d-flex align-items-center">
                                    <i className="bi bi-question-circle"></i>
                                    <span>Need Help?</span>
                                </Link>
                            </li>
                            <li>
                                <hr className="dropdown-divider"/>
                            </li>
                            {/* 프로필 메뉴 항목 */}
                            <li>
                                <Link to="#" className="dropdown-item d-flex align-items-center">
                                    <i className="bi bi-box-arrow-right"></i>
                                    <span>Sign Out</span>
                                </Link>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </header>
    );
}

export default Header;
