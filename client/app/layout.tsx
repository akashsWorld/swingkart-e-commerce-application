import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "Swingkart",
  description: "Swigkart is India's fastest growing online grocery store. Shop online for grocery, cosmetics, fashion, toys, home essentials, beauty and more.",
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body
      >
        {children}
      </body>
    </html>
  );
}
