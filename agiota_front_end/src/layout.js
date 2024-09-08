import { Inter } from "next/font/google";
import "./globals.css";
import Link from "next/link";
import AuthStatus from "./components/authStatus";
import SessionProviderWrapper from "./components/sessionProviderWrapper";

const inter = Inter({ subsets: ["latin"] });

export const metadata = {
    title: "Create Next App",
    description: "Generated by create next app",
};

export default function RootLayout({ children }) {
    return (
        <SessionProviderWrapper>
            <html lang="en">
            <body className={inter.className}>
            <div className="navbar bg-base-100 gap-2">
                <a className="btn btn-ghost text-xl">NavBar</a>
                <Link href="/agiota">Agiota</Link>
                <Link href="/">Home</Link>
                <Link href="/cliente">Cliente</Link>
            </div>
            <div>
                <AuthStatus />
            </div>
            {children}
            <footer className="footer footer-center bg-base-300 text-base-content p-4">
                FOOTER
            </footer>
            </body>
            </html>
        </SessionProviderWrapper>
    );
}