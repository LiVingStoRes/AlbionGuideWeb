document.addEventListener('DOMContentLoaded', () => {
    const themeBtn = document.querySelector('.theme-switch button');
    
    const currentTheme = localStorage.getItem('theme');

    if (currentTheme === 'light') {
        document.body.classList.add('light-theme');
        if (themeBtn) themeBtn.textContent = '☀️ Светлая';
    } else {
        if (themeBtn) themeBtn.textContent = '🌙 Темная';
    }

    if (themeBtn) {
        themeBtn.addEventListener('click', () => {

            document.body.classList.toggle('light-theme');
            
            if (document.body.classList.contains('light-theme')) {
                themeBtn.textContent = '☀️ Светлая';
                localStorage.setItem('theme', 'light');
            } else {
                themeBtn.textContent = '🌙 Темная';
                localStorage.setItem('theme', 'dark');
            }
        });
    }
});