import React from "react";
import "./App.css";
import imagenModelo from "./assets/image.png";

function App() {

  return (

    <div className="main-app">

      {/* ================= NAVBAR ================= */}

      <nav className="navbar">

        {/* LOGO */}

        <div className="logo">
          fashion <span>flow</span>
        </div>

        {/* LINKS */}

        <div className="nav-links">

          <button className="nav-btn">
            MUJER
          </button>

          <button className="nav-btn">
            HOMBRE
          </button>

          <button className="nav-btn">
            TENDENCIA
          </button>

          {/* BUSCADOR */}

          <div className="search-box">

            <input
              type="text"
              placeholder="Buscar..."
            />

          </div>

        </div>

        {/* ICONOS */}

        <div className="icons">

          {/* FAVORITOS */}

          <span>
            ♡
          </span>

          {/* CARRITO */}

          <div className="cart">

            🛒

            <div className="cart-count">
              0
            </div>

          </div>

          {/* PERFIL */}

          <span>
            👤
          </span>

        </div>

      </nav>

      {/* ================= HERO ================= */}

      <section className="hero-container">

        {/* IMAGEN */}

        <div className="hero-image-wrapper">

          <img
            src={imagenModelo}
            alt="Modelo Fashion"
            className="hero-img"
          />

        </div>

        {/* TEXTO */}

        <div className="hero-content">

          <h1 className="hero-title">

            Exprésate

            <br />

            <span className="serif-text">
              sin límites
            </span>

          </h1>

          <div className="hero-divider"></div>

          <p className="hero-subtitle">

            NUEVA COLECCIÓN

          </p>

          <button className="hero-button">

            Descubre ahora →

          </button>

        </div>

      </section>

    </div>

  );

}

export default App;