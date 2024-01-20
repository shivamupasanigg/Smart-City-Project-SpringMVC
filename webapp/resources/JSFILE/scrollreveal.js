const sr = ScrollReveal({
    origin:'top',
    distance:'60px',
    duration: 3000,
    delay:400,
    // reset: true
})

sr.reveal('.home__data , .explore__data, .explore__user , .footer__container')
sr.reveal('.home__card' , {delay:600, distance:'100px', interval: 100})
sr.reveal('.about__data , .join__image' , {origin:'right'})
sr.reveal('.about__image , .join__data', {origin:'left'})
sr.reveal('.popular__card', {interval:200})