import './App.css'
import Hero from './components/Hero'
import Navbar from './components/Navbar'
import Productos from './components/Productos'

function App() {
  return (
    <div className="App">
      <Navbar /> {/* Aqui esta el menu y el carrito */}
      <Hero />   {/* Aqui esta el titulo principal */}
      <Productos /> {/* Lasventanas de mujer,hombre,nuevo */}
    </div>
  )
}

export default App
