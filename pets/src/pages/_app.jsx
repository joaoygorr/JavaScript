import "../ui/styles/globals.css";
import { ThemeProvider } from "@mui/material";
// Temas
import theme from "../ui/themes/theme";

// Components
import Header from "../ui/components/Header";

export default function MyApp({ Component, pageProps }) {
  return (
    <ThemeProvider theme={theme}>
      <Header />
      <Component {...pageProps} />
    </ThemeProvider>
  );
}
