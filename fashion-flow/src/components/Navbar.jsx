function Navbar () {
    return (
        <nav className="navbar">
            <h2>fashion-flow</h2>
            <div className="menu">
                <a href="#" ClassName= "enlace">Mujer</a>
                <a href="#" ClassName= "enlace">Hombre</a>
                <a href="#" ClassName= "enlace">KIDS</a>
                <a href="#" ClassName= "enlace">Nuevo</a>

            </div>
            <div className="carrito">
                🛒 <span>0</span>
                </div>
        </nav>
    )
}
export default Navbar