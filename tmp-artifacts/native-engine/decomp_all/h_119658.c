// entry=0x119658

void H119658(long param_1,long param_2)

{
  undefined **ppuVar1;
  char cVar2;
  byte bVar3;
  bool bVar4;
  bool bVar5;
  long in_x17;
  char *pcVar6;
  char *pcVar7;
  
  pcVar6 = (char *)(param_1 + 2);
  do {
    pcVar7 = pcVar6 + (-DAT_00281e58 | 0x42c7e286cc88cf43U) + (-DAT_00281e58 & 0x42c7e286cc88cf43U);
    cVar2 = *pcVar6;
    bVar3 = -(char)DAT_00281e58;
    pcVar6 = pcVar7;
  } while (cVar2 != (byte)((bVar3 | 0x62) + (bVar3 & 0x62)));
  bVar3 = -(char)DAT_00281e58;
  if (*pcVar7 == (byte)((bVar3 & 0x7f | 0x62) * '\x02' - (bVar3 ^ 0x62))) {
    do {
      pcVar6 = pcVar7 + 1;
      pcVar7 = pcVar7 + 1;
    } while (*pcVar6 == ' ');
  }
  bVar4 = DAT_0029e360 ==
          (-DAT_00281e58 | 0x42c7e286cc88cf42U) * 2 - (-DAT_00281e58 ^ 0x42c7e286cc88cf42U);
  bVar5 = param_2 !=
          (-DAT_00281e58 | 0x42c7e286cc88cf42U) * 2 - (-DAT_00281e58 ^ 0x42c7e286cc88cf42U);
  ppuVar1 = &PTR_LAB_0027db40;
  if (bVar5 == ((in_x17 != 0) == ((DAT_0029e550 != 0 || !bVar4) && (DAT_0029e550 == 0) == bVar4) ||
               in_x17 == 0) || !bVar5) {
    ppuVar1 = &PTR_LAB_0027e6c0;
  }
                    /* WARNING: Could not recover jumptable at 0x0022afb4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


